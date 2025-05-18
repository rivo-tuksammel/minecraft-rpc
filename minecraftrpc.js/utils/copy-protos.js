import fs from 'fs';
import path from 'path';

// Find the directory containing package.json (one level up from utils)
import { fileURLToPath } from 'url';
const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);

const packageJsonDir = path.resolve(__dirname, '..');
const sourceDir = path.resolve(packageJsonDir, '../minecraftrpc/src/main/protobuf');
const destDir = path.resolve(packageJsonDir, 'dist');

// Ensure the destination directory exists
if (!fs.existsSync(destDir)) {
  fs.mkdirSync(destDir, { recursive: true });
  console.log(`Created directory: ${destDir}`);
}

// Remove all .proto files in the destination directory
fs.readdirSync(destDir).forEach(file => {
  if (file.endsWith('.proto')) {
    fs.unlinkSync(path.join(destDir, file));
    console.log(`Deleted ${file}`);
  }
});

// Copy .proto files from source to destination
fs.readdirSync(sourceDir).forEach(file => {
  if (file.endsWith('.proto')) {
    const srcFile = path.join(sourceDir, file);
    const destFile = path.join(destDir, file);
    fs.copyFileSync(srcFile, destFile);
    console.log(`Copied ${file}`);
  }
});