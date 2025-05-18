import commonjs from '@rollup/plugin-commonjs';
import { nodeResolve } from '@rollup/plugin-node-resolve';
import typescript from '@rollup/plugin-typescript';
import dts from 'rollup-plugin-dts';

export default [
  // Bundle JavaScript (ESM only)
  {
    input: 'src/index.ts',
    external: ['fs', 'path', 'os'], // add your externals here
    plugins: [
      nodeResolve({ preferBuiltins: true }),
      commonjs(),
      typescript({ tsconfig: './tsconfig.json' }),
    ],
    output: {
      file: 'dist/bundle.esm.js',
      format: 'esm',
      sourcemap: true,
    },
  },

  // Bundle TypeScript declarations (.d.ts)
  {
    input: 'dist/types/src/index.d.ts',  // where your TS declarations output
    output: [{ file: 'dist/bundle.d.ts', format: 'es' }],
    plugins: [dts()],
  },
];
