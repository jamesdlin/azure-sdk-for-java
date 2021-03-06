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

import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
* Describes a web site.
*/
public class WebSite {
    private boolean adminEnabled;
    
    /**
    * Optional. Read-only. This value is always true.
    * @return The AdminEnabled value.
    */
    public boolean isAdminEnabled() {
        return this.adminEnabled;
    }
    
    /**
    * Optional. Read-only. This value is always true.
    * @param adminEnabledValue The AdminEnabled value.
    */
    public void setAdminEnabled(final boolean adminEnabledValue) {
        this.adminEnabled = adminEnabledValue;
    }
    
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
    
    private boolean enabled;
    
    /**
    * Optional. The current state of the web site. This is true if the site is
    * enabled and false otherwise. Setting this value to false disables the
    * site (takes the site offline).
    * @return The Enabled value.
    */
    public boolean isEnabled() {
        return this.enabled;
    }
    
    /**
    * Optional. The current state of the web site. This is true if the site is
    * enabled and false otherwise. Setting this value to false disables the
    * site (takes the site offline).
    * @param enabledValue The Enabled value.
    */
    public void setEnabled(final boolean enabledValue) {
        this.enabled = enabledValue;
    }
    
    private ArrayList<String> enabledHostNames;
    
    /**
    * Optional. An array of strings that contains enabled host names for the
    * web site. By default, these are [SiteName].azurewebsites.net and
    * [SiteName].scm.azurewebsites.net.
    * @return The EnabledHostNames value.
    */
    public ArrayList<String> getEnabledHostNames() {
        return this.enabledHostNames;
    }
    
    /**
    * Optional. An array of strings that contains enabled host names for the
    * web site. By default, these are [SiteName].azurewebsites.net and
    * [SiteName].scm.azurewebsites.net.
    * @param enabledHostNamesValue The EnabledHostNames value.
    */
    public void setEnabledHostNames(final ArrayList<String> enabledHostNamesValue) {
        this.enabledHostNames = enabledHostNamesValue;
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
    
    private ArrayList<WebSite.WebSiteHostNameSslState> hostNameSslStates;
    
    /**
    * Optional. SSL states bound to the web site.
    * @return The HostNameSslStates value.
    */
    public ArrayList<WebSite.WebSiteHostNameSslState> getHostNameSslStates() {
        return this.hostNameSslStates;
    }
    
    /**
    * Optional. SSL states bound to the web site.
    * @param hostNameSslStatesValue The HostNameSslStates value.
    */
    public void setHostNameSslStates(final ArrayList<WebSite.WebSiteHostNameSslState> hostNameSslStatesValue) {
        this.hostNameSslStates = hostNameSslStatesValue;
    }
    
    private Calendar lastModifiedTimeUtc;
    
    /**
    * Optional. A dateTime value that contains, in Coordinated Universal Time,
    * the last time the web site was modified.
    * @return The LastModifiedTimeUtc value.
    */
    public Calendar getLastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }
    
    /**
    * Optional. A dateTime value that contains, in Coordinated Universal Time,
    * the last time the web site was modified.
    * @param lastModifiedTimeUtcValue The LastModifiedTimeUtc value.
    */
    public void setLastModifiedTimeUtc(final Calendar lastModifiedTimeUtcValue) {
        this.lastModifiedTimeUtc = lastModifiedTimeUtcValue;
    }
    
    private String name;
    
    /**
    * Optional. The name of the web site.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. The name of the web site.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String owner;
    
    /**
    * Optional. The owner of the web site.
    * @return The Owner value.
    */
    public String getOwner() {
        return this.owner;
    }
    
    /**
    * Optional. The owner of the web site.
    * @param ownerValue The Owner value.
    */
    public void setOwner(final String ownerValue) {
        this.owner = ownerValue;
    }
    
    private String repositorySiteName;
    
    /**
    * Optional. The name of the web site repository.
    * @return The RepositorySiteName value.
    */
    public String getRepositorySiteName() {
        return this.repositorySiteName;
    }
    
    /**
    * Optional. The name of the web site repository.
    * @param repositorySiteNameValue The RepositorySiteName value.
    */
    public void setRepositorySiteName(final String repositorySiteNameValue) {
        this.repositorySiteName = repositorySiteNameValue;
    }
    
    private WebSiteRuntimeAvailabilityState runtimeAvailabilityState;
    
    /**
    * Optional. The current availability state for the web site. Possible
    * values are Normal, Degraded, or NotAvailable: Normal: the web site is
    * running correctly; Degraded: the web site is running temporarily in a
    * degraded mode (typically with less memory and a shared instance); Not
    * Available: due to an unexpected issue, the site has been excluded from
    * provisioning. This typically occurs only for free sites.
    * @return The RuntimeAvailabilityState value.
    */
    public WebSiteRuntimeAvailabilityState getRuntimeAvailabilityState() {
        return this.runtimeAvailabilityState;
    }
    
    /**
    * Optional. The current availability state for the web site. Possible
    * values are Normal, Degraded, or NotAvailable: Normal: the web site is
    * running correctly; Degraded: the web site is running temporarily in a
    * degraded mode (typically with less memory and a shared instance); Not
    * Available: due to an unexpected issue, the site has been excluded from
    * provisioning. This typically occurs only for free sites.
    * @param runtimeAvailabilityStateValue The RuntimeAvailabilityState value.
    */
    public void setRuntimeAvailabilityState(final WebSiteRuntimeAvailabilityState runtimeAvailabilityStateValue) {
        this.runtimeAvailabilityState = runtimeAvailabilityStateValue;
    }
    
    private String serverFarm;
    
    /**
    * Optional. A string defining the web site server farm. If a server farm
    * exists, this value is DefaultServerFarm.
    * @return The ServerFarm value.
    */
    public String getServerFarm() {
        return this.serverFarm;
    }
    
    /**
    * Optional. A string defining the web site server farm. If a server farm
    * exists, this value is DefaultServerFarm.
    * @param serverFarmValue The ServerFarm value.
    */
    public void setServerFarm(final String serverFarmValue) {
        this.serverFarm = serverFarmValue;
    }
    
    private WebSiteMode siteMode;
    
    /**
    * Optional. A string representing the web site mode. If the web site mode
    * is Free, this value is Limited. If the web site mode is Shared, this
    * value is Basic. Note: The SiteMode value is not used for Reserved mode.
    * Reserved mode uses the ComputeMode setting.
    * @return The SiteMode value.
    */
    public WebSiteMode getSiteMode() {
        return this.siteMode;
    }
    
    /**
    * Optional. A string representing the web site mode. If the web site mode
    * is Free, this value is Limited. If the web site mode is Shared, this
    * value is Basic. Note: The SiteMode value is not used for Reserved mode.
    * Reserved mode uses the ComputeMode setting.
    * @param siteModeValue The SiteMode value.
    */
    public void setSiteMode(final WebSiteMode siteModeValue) {
        this.siteMode = siteModeValue;
    }
    
    private WebSite.WebSiteProperties siteProperties;
    
    /**
    * Optional. The web site properties of the web site. Contains AppSettings,
    * Metadata, and Properties.
    * @return The SiteProperties value.
    */
    public WebSite.WebSiteProperties getSiteProperties() {
        return this.siteProperties;
    }
    
    /**
    * Optional. The web site properties of the web site. Contains AppSettings,
    * Metadata, and Properties.
    * @param sitePropertiesValue The SiteProperties value.
    */
    public void setSiteProperties(final WebSite.WebSiteProperties sitePropertiesValue) {
        this.siteProperties = sitePropertiesValue;
    }
    
    private ArrayList<WebSite.WebSiteSslCertificate> sslCertificates;
    
    /**
    * Optional. SSL certificates bound to the web site.
    * @return The SslCertificates value.
    */
    public ArrayList<WebSite.WebSiteSslCertificate> getSslCertificates() {
        return this.sslCertificates;
    }
    
    /**
    * Optional. SSL certificates bound to the web site.
    * @param sslCertificatesValue The SslCertificates value.
    */
    public void setSslCertificates(final ArrayList<WebSite.WebSiteSslCertificate> sslCertificatesValue) {
        this.sslCertificates = sslCertificatesValue;
    }
    
    private String state;
    
    /**
    * Optional. A string that describes the state of the web site. Possible
    * values are Stopped or Running.
    * @return The State value.
    */
    public String getState() {
        return this.state;
    }
    
    /**
    * Optional. A string that describes the state of the web site. Possible
    * values are Stopped or Running.
    * @param stateValue The State value.
    */
    public void setState(final String stateValue) {
        this.state = stateValue;
    }
    
    private URI uri;
    
    /**
    * Optional. Direct URL to the web site endpoint on Azure Web Sites,
    * including the subscription ID, web space name, and web site name.
    * @return The Uri value.
    */
    public URI getUri() {
        return this.uri;
    }
    
    /**
    * Optional. Direct URL to the web site endpoint on Azure Web Sites,
    * including the subscription ID, web space name, and web site name.
    * @param uriValue The Uri value.
    */
    public void setUri(final URI uriValue) {
        this.uri = uriValue;
    }
    
    private WebSiteUsageState usageState;
    
    /**
    * Optional. The usage state of the web site. Possible values are Normal or
    * Exceeded. If any quota is exceeded, the UsageState value changes to
    * Exceeded and the site goes offline.
    * @return The UsageState value.
    */
    public WebSiteUsageState getUsageState() {
        return this.usageState;
    }
    
    /**
    * Optional. The usage state of the web site. Possible values are Normal or
    * Exceeded. If any quota is exceeded, the UsageState value changes to
    * Exceeded and the site goes offline.
    * @param usageStateValue The UsageState value.
    */
    public void setUsageState(final WebSiteUsageState usageStateValue) {
        this.usageState = usageStateValue;
    }
    
    private String webSpace;
    
    /**
    * Optional. The name of the web space in which the web site is located.
    * This property is read-only.
    * @return The WebSpace value.
    */
    public String getWebSpace() {
        return this.webSpace;
    }
    
    /**
    * Optional. The name of the web space in which the web site is located.
    * This property is read-only.
    * @param webSpaceValue The WebSpace value.
    */
    public void setWebSpace(final String webSpaceValue) {
        this.webSpace = webSpaceValue;
    }
    
    /**
    * Initializes a new instance of the WebSite class.
    *
    */
    public WebSite() {
        this.setEnabledHostNames(new ArrayList<String>());
        this.setHostNames(new ArrayList<String>());
        this.setHostNameSslStates(new ArrayList<WebSite.WebSiteHostNameSslState>());
        this.setSslCertificates(new ArrayList<WebSite.WebSiteSslCertificate>());
    }
    
    /**
    * SSL state bound to a web site.
    */
    public static class WebSiteHostNameSslState {
        private String name;
        
        /**
        * Optional. The URL of the web site.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. The URL of the web site.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
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
        * Optional. A string containing the thumbprint of the SSL certificate.
        * @return The Thumbprint value.
        */
        public String getThumbprint() {
            return this.thumbprint;
        }
        
        /**
        * Optional. A string containing the thumbprint of the SSL certificate.
        * @param thumbprintValue The Thumbprint value.
        */
        public void setThumbprint(final String thumbprintValue) {
            this.thumbprint = thumbprintValue;
        }
        
        private InetAddress virtualIP;
        
        /**
        * Optional. A string containing the IP address assigned to the hostname
        * if the hostname uses IP SSL.
        * @return The VirtualIP value.
        */
        public InetAddress getVirtualIP() {
            return this.virtualIP;
        }
        
        /**
        * Optional. A string containing the IP address assigned to the hostname
        * if the hostname uses IP SSL.
        * @param virtualIPValue The VirtualIP value.
        */
        public void setVirtualIP(final InetAddress virtualIPValue) {
            this.virtualIP = virtualIPValue;
        }
    }
    
    public static class WebSiteProperties {
        private HashMap<String, String> appSettings;
        
        /**
        * Optional. A set of name/value pairs that contain application settings
        * for a web site.
        * @return The AppSettings value.
        */
        public HashMap<String, String> getAppSettings() {
            return this.appSettings;
        }
        
        /**
        * Optional. A set of name/value pairs that contain application settings
        * for a web site.
        * @param appSettingsValue The AppSettings value.
        */
        public void setAppSettings(final HashMap<String, String> appSettingsValue) {
            this.appSettings = appSettingsValue;
        }
        
        private HashMap<String, String> metadata;
        
        /**
        * Optional. A set of name/value pairs that contain metadata information
        * for a web site.
        * @return The Metadata value.
        */
        public HashMap<String, String> getMetadata() {
            return this.metadata;
        }
        
        /**
        * Optional. A set of name/value pairs that contain metadata information
        * for a web site.
        * @param metadataValue The Metadata value.
        */
        public void setMetadata(final HashMap<String, String> metadataValue) {
            this.metadata = metadataValue;
        }
        
        private HashMap<String, String> properties;
        
        /**
        * Optional. A set of name/value pairs that contain properties for a web
        * site.
        * @return The Properties value.
        */
        public HashMap<String, String> getProperties() {
            return this.properties;
        }
        
        /**
        * Optional. A set of name/value pairs that contain properties for a web
        * site.
        * @param propertiesValue The Properties value.
        */
        public void setProperties(final HashMap<String, String> propertiesValue) {
            this.properties = propertiesValue;
        }
        
        /**
        * Initializes a new instance of the WebSiteProperties class.
        *
        */
        public WebSiteProperties() {
            this.setAppSettings(new HashMap<String, String>());
            this.setMetadata(new HashMap<String, String>());
            this.setProperties(new HashMap<String, String>());
        }
    }
    
    /**
    * The SSL certificate properties.
    */
    public static class WebSiteSslCertificate {
        private Calendar expirationDate;
        
        /**
        * Optional. A dateTime value that contains the expiration date of the
        * certificate.
        * @return The ExpirationDate value.
        */
        public Calendar getExpirationDate() {
            return this.expirationDate;
        }
        
        /**
        * Optional. A dateTime value that contains the expiration date of the
        * certificate.
        * @param expirationDateValue The ExpirationDate value.
        */
        public void setExpirationDate(final Calendar expirationDateValue) {
            this.expirationDate = expirationDateValue;
        }
        
        private String friendlyName;
        
        /**
        * Optional. A string that contains the friendly name of the certificate.
        * @return The FriendlyName value.
        */
        public String getFriendlyName() {
            return this.friendlyName;
        }
        
        /**
        * Optional. A string that contains the friendly name of the certificate.
        * @param friendlyNameValue The FriendlyName value.
        */
        public void setFriendlyName(final String friendlyNameValue) {
            this.friendlyName = friendlyNameValue;
        }
        
        private ArrayList<String> hostNames;
        
        /**
        * Optional. An array of strings that contain the host names to which
        * the certificate is bound.
        * @return The HostNames value.
        */
        public ArrayList<String> getHostNames() {
            return this.hostNames;
        }
        
        /**
        * Optional. An array of strings that contain the host names to which
        * the certificate is bound.
        * @param hostNamesValue The HostNames value.
        */
        public void setHostNames(final ArrayList<String> hostNamesValue) {
            this.hostNames = hostNamesValue;
        }
        
        private Calendar issueDate;
        
        /**
        * Optional. A dateTime value that contains the date that the
        * certificate was issued.
        * @return The IssueDate value.
        */
        public Calendar getIssueDate() {
            return this.issueDate;
        }
        
        /**
        * Optional. A dateTime value that contains the date that the
        * certificate was issued.
        * @param issueDateValue The IssueDate value.
        */
        public void setIssueDate(final Calendar issueDateValue) {
            this.issueDate = issueDateValue;
        }
        
        private String issuer;
        
        /**
        * Optional. A string that identifies the issuer of the certificate.
        * @return The Issuer value.
        */
        public String getIssuer() {
            return this.issuer;
        }
        
        /**
        * Optional. A string that identifies the issuer of the certificate.
        * @param issuerValue The Issuer value.
        */
        public void setIssuer(final String issuerValue) {
            this.issuer = issuerValue;
        }
        
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
        
        private Boolean isValid;
        
        /**
        * Optional. Indicates if the certificate is valid.
        * @return The IsValid value.
        */
        public Boolean isValid() {
            return this.isValid;
        }
        
        /**
        * Optional. Indicates if the certificate is valid.
        * @param isValidValue The IsValid value.
        */
        public void setIsValid(final Boolean isValidValue) {
            this.isValid = isValidValue;
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
        
        private URI selfLinkUri;
        
        /**
        * Optional. An anyURI value that contains the endpoint of the site to
        * which the certificate is bound.
        * @return The SelfLinkUri value.
        */
        public URI getSelfLinkUri() {
            return this.selfLinkUri;
        }
        
        /**
        * Optional. An anyURI value that contains the endpoint of the site to
        * which the certificate is bound.
        * @param selfLinkUriValue The SelfLinkUri value.
        */
        public void setSelfLinkUri(final URI selfLinkUriValue) {
            this.selfLinkUri = selfLinkUriValue;
        }
        
        private String siteName;
        
        /**
        * Optional. A string that contains the name of the site to which the
        * certificate is bound.
        * @return The SiteName value.
        */
        public String getSiteName() {
            return this.siteName;
        }
        
        /**
        * Optional. A string that contains the name of the site to which the
        * certificate is bound.
        * @param siteNameValue The SiteName value.
        */
        public void setSiteName(final String siteNameValue) {
            this.siteName = siteNameValue;
        }
        
        private String subjectName;
        
        /**
        * Optional. A string that contains the name of the entity to whom the
        * certificate was issued.
        * @return The SubjectName value.
        */
        public String getSubjectName() {
            return this.subjectName;
        }
        
        /**
        * Optional. A string that contains the name of the entity to whom the
        * certificate was issued.
        * @param subjectNameValue The SubjectName value.
        */
        public void setSubjectName(final String subjectNameValue) {
            this.subjectName = subjectNameValue;
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
        
        /**
        * Initializes a new instance of the WebSiteSslCertificate class.
        *
        */
        public WebSiteSslCertificate() {
            this.setHostNames(new ArrayList<String>());
        }
    }
}
