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
* The custom DNS settings that are specified for the deployment.
*/
public class DnsSettings {
    private ArrayList<DnsServer> dnsServers;
    
    /**
    * Optional. Contains a collection of objects that define the DNS server
    * settings.
    * @return The DnsServers value.
    */
    public ArrayList<DnsServer> getDnsServers() {
        return this.dnsServers;
    }
    
    /**
    * Optional. Contains a collection of objects that define the DNS server
    * settings.
    * @param dnsServersValue The DnsServers value.
    */
    public void setDnsServers(final ArrayList<DnsServer> dnsServersValue) {
        this.dnsServers = dnsServersValue;
    }
    
    /**
    * Initializes a new instance of the DnsSettings class.
    *
    */
    public DnsSettings() {
        this.setDnsServers(new ArrayList<DnsServer>());
    }
}
