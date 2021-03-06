/*
 * SampleLegacyDataManagerDialogForLAICPMS_MC_UA_VV.java
 *
  *
 *
 * Copyright 2006-2015 James F. Bowring and www.Earth-Time.org
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.earthtime.UPb_Redux.dialogs.sampleManagers.legacyManagers;

import java.io.File;
import org.earthtime.UPb_Redux.samples.Sample;
import org.earthtime.UPb_Redux.samples.sampleImporters.SampleImporterFromLAICPMSLegacyCVSFile_MC_UA;
import org.earthtime.UPb_Redux.samples.sampleImporters.SampleImporterFromLAICPMSLegacyCVSFile_SC_WSU_VV;

/**
 *
 * @author James F. Bowring
 */
public class SampleLegacyDataManagerDialogForLAICPMS_MC_UA_VV  extends AbstractSampleLegacyManagerDialog {

    /**
     * 
     * @param parent
     * @param modal
     * @param sample
     * @param importFractionFolderMRU
     */
    public SampleLegacyDataManagerDialogForLAICPMS_MC_UA_VV (
            java.awt.Frame parent,
            boolean modal,
            Sample sample,
            File importFractionFolderMRU ) {

        super( parent,
                modal,
                "LA-ICPMS Data",
                sample,
                new SampleImporterFromLAICPMSLegacyCVSFile_SC_WSU_VV(),
                importFractionFolderMRU );
    }
}
