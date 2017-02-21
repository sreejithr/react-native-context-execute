
# react-native-context-execute

Execute JS code in React Native's context even when RN is inactive (eg. app in background).

In Android, where background services are indispensable, keeping RN in sync can be hard since RN doesn't stay active in background. **Currently, Android-only**.

A tiny library which registers a `JavascriptModule` in RN's `JavascriptModuleRegistry` and makes `Catalyst` (Bridge) run it.

Before using this, please note that **HeadlessJS** is another good way to go.

## Getting started

`$ npm install react-native-context-execute --save`

### Mostly automatic installation

`$ rnpm link react-native-context-execute`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNContextExecutePackage;` to the imports at the top of the file
  - Add `new RNContextExecutePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-context-execute'
  	project(':react-native-context-execute').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-context-execute/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-context-execute')
  	```

## Usage
```javascript
import { ContextExecute } from 'react-native-context-execute';

ContextExecute((op, data) => {
    // Do your thing
});

```
