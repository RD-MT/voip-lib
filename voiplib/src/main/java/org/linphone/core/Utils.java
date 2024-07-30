package org.linphone.core;

public class Utils {
   public static String getPrefixFromE164(String e164) {
      DialPlan[] dialPlans = Factory.instance().getDialPlans();
      DialPlan dialPlan = dialPlans[0];
      return String.valueOf(dialPlan.lookupCccFromE164(e164));
   }

   public static int getCccFromIso(String countryIso) {
      DialPlan[] dialPlans = Factory.instance().getDialPlans();
      DialPlan dialPlan = dialPlans[0];
      return dialPlan.lookupCccFromIso(countryIso);
   }
}
