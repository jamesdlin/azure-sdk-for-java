/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

import java.util.ArrayList;

/**
* Parameters supplied to the Replicate Virtual Machine Image operation.
*/
public class VirtualMachineVMImageReplicateParameters {
    private ArrayList<String> targetLocations;
    
    /**
    * Optional. The replication target regional locations.Note: The regions in
    * the request body are not additive. If a VM Image has already been
    * replicated to Regions A, B, and C, and a request is made to replicate to
    * Regions A and D, the VM Image will remain in Region A, will be
    * replicated in Region D, and will be unreplicated from Regions B and C.
    * @return The TargetLocations value.
    */
    public ArrayList<String> getTargetLocations() {
        return this.targetLocations;
    }
    
    /**
    * Optional. The replication target regional locations.Note: The regions in
    * the request body are not additive. If a VM Image has already been
    * replicated to Regions A, B, and C, and a request is made to replicate to
    * Regions A and D, the VM Image will remain in Region A, will be
    * replicated in Region D, and will be unreplicated from Regions B and C.
    * @param targetLocationsValue The TargetLocations value.
    */
    public void setTargetLocations(final ArrayList<String> targetLocationsValue) {
        this.targetLocations = targetLocationsValue;
    }
    
    /**
    * Initializes a new instance of the
    * VirtualMachineVMImageReplicateParameters class.
    *
    */
    public VirtualMachineVMImageReplicateParameters() {
        this.setTargetLocations(new ArrayList<String>());
    }
}
