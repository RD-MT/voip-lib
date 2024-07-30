package org.linphone.core.tools.compatibility;

import java.util.Map;

public class DeviceUtils24 {
   public static String getStringOrDefaultFromMap(Map<String, String> map, String key, String defaultValue) {
      return (String)map.getOrDefault(key, defaultValue);
   }
}
