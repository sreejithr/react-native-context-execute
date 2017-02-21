
# react-native-context-execute

## Getting started

`$ npm install react-native-context-execute --save`

### Mostly automatic installation

`$ rnpm link react-native-context-execute`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-context-execute` and add `RNContextExecute.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNContextExecute.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

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
