import { NativeModules } from 'react-native';
export { default as ContextExecute } from './ContextExecutorJSModule';

const { RNContextExecute } = NativeModules;

export default RNContextExecute;
