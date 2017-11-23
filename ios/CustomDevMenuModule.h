//
//  CustomDevMenuModule.h
//  devMenu
//
//  Created by Panindra Tumkur Seetharamu on 11/22/17.
//  Copyright © 2017 Facebook. All rights reserved.
//
@interface CustomDevMenuModule : NSObject <RCTBridgeModule>
#if __has_include("RCTDevMenu.h")
@property (nonatomic, strong, readonly) RCTDevMenuItem *devMenuItem;
#endif
@end
