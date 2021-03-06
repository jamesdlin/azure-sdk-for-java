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

package com.microsoft.windowsazure.management.sql.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Iterator;

/**
* The response structure for the Server List operation.  Contains a list of all
* the servers in a subscription.
*/
public class ServerListResponse extends OperationResponse implements Iterable<Server> {
    private ArrayList<Server> servers;
    
    /**
    * Optional. Gets the collection of Azure SQL Database Servers that are
    * valid for your subscription.
    * @return The Servers value.
    */
    public ArrayList<Server> getServers() {
        return this.servers;
    }
    
    /**
    * Optional. Gets the collection of Azure SQL Database Servers that are
    * valid for your subscription.
    * @param serversValue The Servers value.
    */
    public void setServers(final ArrayList<Server> serversValue) {
        this.servers = serversValue;
    }
    
    /**
    * Initializes a new instance of the ServerListResponse class.
    *
    */
    public ServerListResponse() {
        super();
        this.setServers(new ArrayList<Server>());
    }
    
    /**
    * Gets the sequence of Servers.
    *
    */
    public Iterator<Server> iterator() {
        return this.getServers().iterator();
    }
}
