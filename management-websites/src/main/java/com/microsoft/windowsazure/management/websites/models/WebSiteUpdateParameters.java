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

package com.microsoft.windowsazure.management.websites.models;

import java.util.ArrayList;

/**
* Parameters supplied to the Update Web Site operation.
*/
public class WebSiteUpdateParameters {
    private WebSpaceAvailabilityState availabilityState;
    
    /**
    * Optional. The state of the availability of management information for the
    * web site. Possible values are Normal or Limited. Normal means that the
    * web site is running correctly and that management information for the
    * web site is available. Limited means that only partial management
    * information for the web site is available and that detailed web site
    * information is unavailable.
    * @return The AvailabilityState value.
    */
    public WebSpaceAvailabilityState getAvailabilityState() {
        return this.availabilityState;
    }
    
    /**
    * Optional. The state of the availability of management information for the
    * web site. Possible values are Normal or Limited. Normal means that the
    * web site is running correctly and that management information for the
    * web site is available. Limited means that only partial management
    * information for the web site is available and that detailed web site
    * information is unavailable.
    * @param availabilityStateValue The AvailabilityState value.
    */
    public void setAvailabilityState(final WebSpaceAvailabilityState availabilityStateValue) {
        this.availabilityState = availabilityStateValue;
    }
    
    private WebSiteComputeMode computeMode;
    
    /**
    * Optional. The Compute Mode for the web site. Possible values are Shared
    * or Dedicated.
    * @return The ComputeMode value.
    */
    public WebSiteComputeMode getComputeMode() {
        return this.computeMode;
    }
    
    /**
    * Optional. The Compute Mode for the web site. Possible values are Shared
    * or Dedicated.
    * @param computeModeValue The ComputeMode value.
    */
    public void setComputeMode(final WebSiteComputeMode computeModeValue) {
        this.computeMode = computeModeValue;
    }
    
    private Boolean enabled;
    
    /**
    * Optional. Indicates if the site is enabled. Setting this value to false
    * disables the site (takes the site offline).
    * @return The Enabled value.
    */
    public Boolean isEnabled() {
        return this.enabled;
    }
    
    /**
    * Optional. Indicates if the site is enabled. Setting this value to false
    * disables the site (takes the site offline).
    * @param enabledValue The Enabled value.
    */
    public void setEnabled(final Boolean enabledValue) {
        this.enabled = enabledValue;
    }
    
    private ArrayList<String> hostNames;
    
    /**
    * Optional. An array of strings that contains the public host names for the
    * web site, including custom domains. Important: When you add a custom
    * domain in a PUT operation, be sure to include every host name that you
    * want for the web site. To delete a custom domain name in a PUT
    * operation, include all of the host names for the web site that you want
    * to keep, but leave out the one that you want to delete.
    * @return The HostNames value.
    */
    public ArrayList<String> getHostNames() {
        return this.hostNames;
    }
    
    /**
    * Optional. An array of strings that contains the public host names for the
    * web site, including custom domains. Important: When you add a custom
    * domain in a PUT operation, be sure to include every host name that you
    * want for the web site. To delete a custom domain name in a PUT
    * operation, include all of the host names for the web site that you want
    * to keep, but leave out the one that you want to delete.
    * @param hostNamesValue The HostNames value.
    */
    public void setHostNames(final ArrayList<String> hostNamesValue) {
        this.hostNames = hostNamesValue;
    }
    
    private ArrayList<WebSiteUpdateParameters.WebSiteHostNameSslState> hostNameSslStates;
    
    /**
    * Optional. SSL states bound to the web site.
    * @return The HostNameSslStates value.
    */
    public ArrayList<WebSiteUpdateParameters.WebSiteHostNameSslState> getHostNameSslStates() {
        return this.hostNameSslStates;
    }
    
    /**
    * Optional. SSL states bound to the web site.
    * @param hostNameSslStatesValue The HostNameSslStates value.
    */
    public void setHostNameSslStates(final ArrayList<WebSiteUpdateParameters.WebSiteHostNameSslState> hostNameSslStatesValue) {
        this.hostNameSslStates = hostNameSslStatesValue;
    }
    
    private WebSiteRuntimeAvailabilityState runtimeAvailabilityState;
    
    /**
    * Optional. The current runtime availability state. Possible values are
    * Normal, Degraded, or NotAvailable: Normal: the web site is running
    * correctly; Degraded: the web site is running temporarily in a degraded
    * mode (typically with less memory and a shared instance). Not Available:
    * due to an unexpected issue, the web site has been excluded from
    * provisioning. This typically occurs only for free sites.
    * @return The RuntimeAvailabilityState value.
    */
    public WebSiteRuntimeAvailabilityState getRuntimeAvailabilityState() {
        return this.runtimeAvailabilityState;
    }
    
    /**
    * Optional. The current runtime availability state. Possible values are
    * Normal, Degraded, or NotAvailable: Normal: the web site is running
    * correctly; Degraded: the web site is running temporarily in a degraded
    * mode (typically with less memory and a shared instance). Not Available:
    * due to an unexpected issue, the web site has been excluded from
    * provisioning. This typically occurs only for free sites.
    * @param runtimeAvailabilityStateValue The RuntimeAvailabilityState value.
    */
    public void setRuntimeAvailabilityState(final WebSiteRuntimeAvailabilityState runtimeAvailabilityStateValue) {
        this.runtimeAvailabilityState = runtimeAvailabilityStateValue;
    }
    
    private String serverFarm;
    
    /**
    * Optional. String specifying the server farm. If a server farm exists,
    * this value is DefaultServerFarm.
    * @return The ServerFarm value.
    */
    public String getServerFarm() {
        return this.serverFarm;
    }
    
    /**
    * Optional. String specifying the server farm. If a server farm exists,
    * this value is DefaultServerFarm.
    * @param serverFarmValue The ServerFarm value.
    */
    public void setServerFarm(final String serverFarmValue) {
        this.serverFarm = serverFarmValue;
    }
    
    private WebSiteMode siteMode;
    
    /**
    * Optional. String that represents the web site mode. If the web site mode
    * is Free, this value is Limited. If the web site mode is Shared, this
    * value is Basic. Note: The SiteMode value is not used for Reserved mode.
    * Reserved mode uses the ComputeMode setting.
    * @return The SiteMode value.
    */
    public WebSiteMode getSiteMode() {
        return this.siteMode;
    }
    
    /**
    * Optional. String that represents the web site mode. If the web site mode
    * is Free, this value is Limited. If the web site mode is Shared, this
    * value is Basic. Note: The SiteMode value is not used for Reserved mode.
    * Reserved mode uses the ComputeMode setting.
    * @param siteModeValue The SiteMode value.
    */
    public void setSiteMode(final WebSiteMode siteModeValue) {
        this.siteMode = siteModeValue;
    }
    
    private ArrayList<WebSiteUpdateParameters.WebSiteSslCertificate> sslCertificates;
    
    /**
    * Optional. SSL certificates bound to the web site.
    * @return The SslCertificates value.
    */
    public ArrayList<WebSiteUpdateParameters.WebSiteSslCertificate> getSslCertificates() {
        return this.sslCertificates;
    }
    
    /**
    * Optional. SSL certificates bound to the web site.
    * @param sslCertificatesValue The SslCertificates value.
    */
    public void setSslCertificates(final ArrayList<WebSiteUpdateParameters.WebSiteSslCertificate> sslCertificatesValue) {
        this.sslCertificates = sslCertificatesValue;
    }
    
    private String state;
    
    /**
    * Optional. A string that describes the state of the web site. Possible
    * values include Stopped, Running, or QuotaExceeded.
    * @return The State value.
    */
    public String getState() {
        return this.state;
    }
    
    /**
    * Optional. A string that describes the state of the web site. Possible
    * values include Stopped, Running, or QuotaExceeded.
    * @param stateValue The State value.
    */
    public void setState(final String stateValue) {
        this.state = stateValue;
    }
    
    /**
    * Initializes a new instance of the WebSiteUpdateParameters class.
    *
    */
    public WebSiteUpdateParameters() {
        this.setHostNames(new ArrayList<String>());
        this.setHostNameSslStates(new ArrayList<WebSiteUpdateParameters.WebSiteHostNameSslState>());
        this.setSslCertificates(new ArrayList<WebSiteUpdateParameters.WebSiteSslCertificate>());
    }
    
    /**
    * SSL state bound to the web site.
    */
    public static class WebSiteHostNameSslState {
        private WebSiteSslState sslState;
        
        /**
        * Optional. The SSL state. Possible values are Disabled, SniEnabled, or
        * IpBasedEnabled.
        * @return The SslState value.
        */
        public WebSiteSslState getSslState() {
            return this.sslState;
        }
        
        /**
        * Optional. The SSL state. Possible values are Disabled, SniEnabled, or
        * IpBasedEnabled.
        * @param sslStateValue The SslState value.
        */
        public void setSslState(final WebSiteSslState sslStateValue) {
            this.sslState = sslStateValue;
        }
        
        private String thumbprint;
        
        /**
        * Optional. A string that contains the thumbprint of the SSL
        * certificate.
        * @return The Thumbprint value.
        */
        public String getThumbprint() {
            return this.thumbprint;
        }
        
        /**
        * Optional. A string that contains the thumbprint of the SSL
        * certificate.
        * @param thumbprintValue The Thumbprint value.
        */
        public void setThumbprint(final String thumbprintValue) {
            this.thumbprint = thumbprintValue;
        }
        
        private Boolean toUpdate;
        
        /**
        * Optional. Indicates whether the SSL state will be updated.
        * @return The ToUpdate value.
        */
        public Boolean isToUpdate() {
            return this.toUpdate;
        }
        
        /**
        * Optional. Indicates whether the SSL state will be updated.
        * @param toUpdateValue The ToUpdate value.
        */
        public void setToUpdate(final Boolean toUpdateValue) {
            this.toUpdate = toUpdateValue;
        }
    }
    
    /**
    * The properties for an SSL certificate.
    */
    public static class WebSiteSslCertificate {
        private Boolean isToBeDeleted;
        
        /**
        * Optional. Indicates if the certificate is to be deleted.
        * @return The IsToBeDeleted value.
        */
        public Boolean isToBeDeleted() {
            return this.isToBeDeleted;
        }
        
        /**
        * Optional. Indicates if the certificate is to be deleted.
        * @param isToBeDeletedValue The IsToBeDeleted value.
        */
        public void setIsToBeDeleted(final Boolean isToBeDeletedValue) {
            this.isToBeDeleted = isToBeDeletedValue;
        }
        
        private String password;
        
        /**
        * Optional. A string that contains the password for the certificate.
        * @return The Password value.
        */
        public String getPassword() {
            return this.password;
        }
        
        /**
        * Optional. A string that contains the password for the certificate.
        * @param passwordValue The Password value.
        */
        public void setPassword(final String passwordValue) {
            this.password = passwordValue;
        }
        
        private byte[] pfxBlob;
        
        /**
        * Optional. A base64Binary value that contains the PfxBlob of the
        * certificate.
        * @return The PfxBlob value.
        */
        public byte[] getPfxBlob() {
            return this.pfxBlob;
        }
        
        /**
        * Optional. A base64Binary value that contains the PfxBlob of the
        * certificate.
        * @param pfxBlobValue The PfxBlob value.
        */
        public void setPfxBlob(final byte[] pfxBlobValue) {
            this.pfxBlob = pfxBlobValue;
        }
        
        private String thumbprint;
        
        /**
        * Optional. A string that contains the certificate thumbprint.
        * @return The Thumbprint value.
        */
        public String getThumbprint() {
            return this.thumbprint;
        }
        
        /**
        * Optional. A string that contains the certificate thumbprint.
        * @param thumbprintValue The Thumbprint value.
        */
        public void setThumbprint(final String thumbprintValue) {
            this.thumbprint = thumbprintValue;
        }
    }
}
