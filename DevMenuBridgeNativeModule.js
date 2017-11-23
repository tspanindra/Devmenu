//  Created by react-native-create-bridge

import { NativeModules } from 'react-native'

const { DevMenuBridge } = NativeModules

export default {
  exampleMethod () {
    return DevMenuBridge.exampleMethod()
  },

  EXAMPLE_CONSTANT: DevMenuBridge.EXAMPLE_CONSTANT
}
