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

package com.microsoft.windowsazure.management.store.models;

/**
* Represents the data passed to the Create Cloud Service API method.
*/
public class CloudServiceCreateParameters
{
    private String description;
    
    /**
    * The description for the cloud service to be created.
    */
    public String getDescription()
    {
        return this.description;
    }
    
    /**
    * The description for the cloud service to be created.
    */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    private String geoRegion;
    
    /**
    * The geographical region to create the cloud service in.
    */
    public String getGeoRegion()
    {
        return this.geoRegion;
    }
    
    /**
    * The geographical region to create the cloud service in.
    */
    public void setGeoRegion(String geoRegion)
    {
        this.geoRegion = geoRegion;
    }
    
    private String label;
    
    /**
    * The label of the cloud service to be created.
    */
    public String getLabel()
    {
        return this.label;
    }
    
    /**
    * The label of the cloud service to be created.
    */
    public void setLabel(String label)
    {
        this.label = label;
    }
    
    private String name;
    
    /**
    * The name of the cloud service to be created.
    */
    public String getName()
    {
        return this.name;
    }
    
    /**
    * The name of the cloud service to be created.
    */
    public void setName(String name)
    {
        this.name = name;
    }
}