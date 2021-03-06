/*
 * NUPlasmaMultiCollFaradayTRARawDataTemplate.java
 *
 * Created Jul 1, 2011
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
package org.earthtime.Tripoli.rawDataFiles.templates;

import java.io.Serializable;
import java.util.TimeZone;
import org.earthtime.Tripoli.dataModels.inputParametersModels.AbstractAcquisitionModel;
import org.earthtime.Tripoli.dataModels.inputParametersModels.StaticAcquisition;
import org.earthtime.dataDictionaries.FileTypeEnum;

/**
 *
 * @author James F. Bowring
 */
public final class NUPlasmaMultiCollFaradayTRARawDataTemplate extends AbstractRawDataFileTemplate implements //
        Comparable<AbstractRawDataFileTemplate>,
        Serializable {

    private static NUPlasmaMultiCollFaradayTRARawDataTemplate instance = null;

    private NUPlasmaMultiCollFaradayTRARawDataTemplate () {
        super();

        this.NAME = "Arizona NUPlasma TRA";
        this.aboutInfo = "U-Th-Pb Faraday TRA analysis runs";
        this.fileType = FileTypeEnum.txt;
        this.startOfFirstLine = "Version 5";
        this.startOfDataSectionFirstLine = "Spare text";
        this.startOfEachBlockFirstLine = "Spare text";
        this.endOfEachBlockLastLine = "";
        this.blockStartOffset = 0; // not used
        this.blockSize = 0;// determined from data values; not constant
        this.standardIDs = new String[]//
        {"SL"};
        this.timeZone = TimeZone.getTimeZone( "MST" );
        this.defaultParsingOfFractionsBehavior = 1;

    }

    /**
     *
     * @return
     */
    public static NUPlasmaMultiCollFaradayTRARawDataTemplate getInstance () {
        if ( instance == null ) {
            instance = new NUPlasmaMultiCollFaradayTRARawDataTemplate();
        }
        return instance;
    }
    
    /**
     *
     * @return
     */
    @Override
    public AbstractAcquisitionModel makeNewAcquisitionModel(){
        this.acquisitionModel = new StaticAcquisition();
        return acquisitionModel;
    }
}
