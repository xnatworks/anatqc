package org.neuroinfo.anatqc;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;

@XnatPlugin(value = "anatqcPlugin", name = "AnatQC Plugin",
            description = "Provides the AnatQC (neuroinfo:anatqc) data type and report page.",
            dataModels = {@XnatDataModel(value = "neuroinfo:anatqc", singular = "AnatQC", plural = "AnatQCs")})
public class AnatqcPlugin {
}
