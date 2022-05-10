package dsabootcamp.design_patterns.factory_pattern.factoryClasses;

import dsabootcamp.design_patterns.factory_pattern.OS;

public class OperatingSystemFactory {
    public OS getInstance(String str)
    {
        if(str.equals("Open"))
        {
            return new Android();
        }
        else if( str.equals("Close") || (str.equals("close")))
        {
            return new IOS();
        }
        else if(str.equals("Other")){
            return new Other();
        }
        else {
            return new OldOS();
        }
    }
}
