// build.js: Build script for proto types
import fs from 'fs';
import path from 'path';
import { execSync } from 'child_process';

const __dirname = path.dirname(new URL(import.meta.url).pathname);
const genProtosDir = path.join(__dirname, '../dist');
const protosDir = path.join(__dirname, '../dist');
const copyProtosScript = path.join(__dirname, 'copy-protos.js');

// 1. Check if gen/protos exists, clear it if so
if (fs.existsSync(genProtosDir)) {
  fs.rmSync(genProtosDir, { recursive: true, force: true });
} else {
    fs.mkdirSync(genProtosDir, { recursive: true });
    console.log(`Created directory: ${genProtosDir}`);
}

// 2. Call copy-protos.js
execSync(`node "${copyProtosScript}"`, { stdio: 'inherit' });

// 3. Run proto-loader-gen-types
const protoGenCmd = [
  'npx proto-loader-gen-types',
  '--longs=String',
  '--enums=String',
  '--defaults',
  '--oneofs',
  '--includeComments',
  '--grpcLib=@grpc/grpc-js',
  '--includeComments',
  `--outDir=${genProtosDir}`,
  `${protosDir}/*.proto`
].join(' ');

execSync(protoGenCmd, { stdio: 'inherit' });

// 4. Run TypeScript compiler
execSync('npx tsc', { stdio: 'inherit' });
