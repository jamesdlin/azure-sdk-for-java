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
* Objects that provide system or application data.
*/
public class ConfigurationSet
{
    private String adminPassword;
    
    /**
    * Required. Specifies the string representing the administrator password to
    * use for the virtual machine.
    */
    public String getAdminPassword()
    {
        return this.adminPassword;
    }
    
    /**
    * Required. Specifies the string representing the administrator password to
    * use for the virtual machine.
    */
    public void setAdminPassword(String adminPassword)
    {
        this.adminPassword = adminPassword;
    }
    
    private String adminUserName;
    
    /**
    * Required. Specifies the name that is used to rename the default
    * administrator account. This is a required parameter after version
    * 2013-03-01.
    */
    public String getAdminUserName()
    {
        return this.adminUserName;
    }
    
    /**
    * Required. Specifies the name that is used to rename the default
    * administrator account. This is a required parameter after version
    * 2013-03-01.
    */
    public void setAdminUserName(String adminUserName)
    {
        this.adminUserName = adminUserName;
    }
    
    private String computerName;
    
    /**
    * Optional. Specifies the computer name for the virtual machine. If the
    * computer name is not specified, a name is created based on the name of
    * the role.  Computer names must be 1 to 15 characters in length. This
    * element is only used with the WindowsProvisioningConfiguration set.
    */
    public String getComputerName()
    {
        return this.computerName;
    }
    
    /**
    * Optional. Specifies the computer name for the virtual machine. If the
    * computer name is not specified, a name is created based on the name of
    * the role.  Computer names must be 1 to 15 characters in length. This
    * element is only used with the WindowsProvisioningConfiguration set.
    */
    public void setComputerName(String computerName)
    {
        this.computerName = computerName;
    }
    
    private String configurationSetType;
    
    /**
    * Specifies the configuration type for the configuration set.
    */
    public String getConfigurationSetType()
    {
        return this.configurationSetType;
    }
    
    /**
    * Specifies the configuration type for the configuration set.
    */
    public void setConfigurationSetType(String configurationSetType)
    {
        this.configurationSetType = configurationSetType;
    }
    
    private Boolean disableSshPasswordAuthentication;
    
    /**
    * Optional. Specifies whether or not SSH authentication is disabled for the
    * password. This element is only used with the
    * LinuxProvisioningConfiguration set. By default this value is set to true.
    */
    public Boolean getDisableSshPasswordAuthentication()
    {
        return this.disableSshPasswordAuthentication;
    }
    
    /**
    * Optional. Specifies whether or not SSH authentication is disabled for the
    * password. This element is only used with the
    * LinuxProvisioningConfiguration set. By default this value is set to true.
    */
    public void setDisableSshPasswordAuthentication(Boolean disableSshPasswordAuthentication)
    {
        this.disableSshPasswordAuthentication = disableSshPasswordAuthentication;
    }
    
    private DomainJoinSettings domainJoin;
    
    /**
    * Optional.  Contains properties that specify a domain to which the virtual
    * machine will be joined. This element is only used with the
    * WindowsProvisioningConfiguration set.
    */
    public DomainJoinSettings getDomainJoin()
    {
        return this.domainJoin;
    }
    
    /**
    * Optional.  Contains properties that specify a domain to which the virtual
    * machine will be joined. This element is only used with the
    * WindowsProvisioningConfiguration set.
    */
    public void setDomainJoin(DomainJoinSettings domainJoin)
    {
        this.domainJoin = domainJoin;
    }
    
    private Boolean enableAutomaticUpdates;
    
    /**
    * Optional. Specifies whether automatic updates are enabled for the virtual
    * machine. This element is only used with the
    * WindowsProvisioningConfiguration set. The default value is false.
    */
    public Boolean getEnableAutomaticUpdates()
    {
        return this.enableAutomaticUpdates;
    }
    
    /**
    * Optional. Specifies whether automatic updates are enabled for the virtual
    * machine. This element is only used with the
    * WindowsProvisioningConfiguration set. The default value is false.
    */
    public void setEnableAutomaticUpdates(Boolean enableAutomaticUpdates)
    {
        this.enableAutomaticUpdates = enableAutomaticUpdates;
    }
    
    private String hostName;
    
    /**
    * Required. Specifies the host name for the VM. Host names are ASCII
    * character strings 1 to 64 characters in length. This element is only
    * used with the LinuxProvisioningConfiguration set.
    */
    public String getHostName()
    {
        return this.hostName;
    }
    
    /**
    * Required. Specifies the host name for the VM. Host names are ASCII
    * character strings 1 to 64 characters in length. This element is only
    * used with the LinuxProvisioningConfiguration set.
    */
    public void setHostName(String hostName)
    {
        this.hostName = hostName;
    }
    
    private ArrayList<InputEndpoint> inputEndpoints;
    
    /**
    * Contains a collection of external endpoints for the virtual machine.
    * This element is only used with the NetworkConfigurationSet type.
    */
    public ArrayList<InputEndpoint> getInputEndpoints()
    {
        return this.inputEndpoints;
    }
    
    /**
    * Contains a collection of external endpoints for the virtual machine.
    * This element is only used with the NetworkConfigurationSet type.
    */
    public void setInputEndpoints(ArrayList<InputEndpoint> inputEndpoints)
    {
        this.inputEndpoints = inputEndpoints;
    }
    
    private Boolean resetPasswordOnFirstLogon;
    
    /**
    * Optional. Specifies whether password should be reset the first time the
    * administrator logs in.
    */
    public Boolean getResetPasswordOnFirstLogon()
    {
        return this.resetPasswordOnFirstLogon;
    }
    
    /**
    * Optional. Specifies whether password should be reset the first time the
    * administrator logs in.
    */
    public void setResetPasswordOnFirstLogon(Boolean resetPasswordOnFirstLogon)
    {
        this.resetPasswordOnFirstLogon = resetPasswordOnFirstLogon;
    }
    
    private SshSettings sshSettings;
    
    /**
    * Optional. Specifies the SSH public keys and key pairs to populate in the
    * image during provisioning. This element is only used with the
    * LinuxProvisioningConfiguration set.
    */
    public SshSettings getSshSettings()
    {
        return this.sshSettings;
    }
    
    /**
    * Optional. Specifies the SSH public keys and key pairs to populate in the
    * image during provisioning. This element is only used with the
    * LinuxProvisioningConfiguration set.
    */
    public void setSshSettings(SshSettings sshSettings)
    {
        this.sshSettings = sshSettings;
    }
    
    private ArrayList<StoredCertificateSettings> storedCertificateSettings;
    
    /**
    * Optional. Contains a list of service certificates with which to provision
    * to the new role. This element is only used with the
    * WindowsProvisioningConfiguration set.
    */
    public ArrayList<StoredCertificateSettings> getStoredCertificateSettings()
    {
        return this.storedCertificateSettings;
    }
    
    /**
    * Optional. Contains a list of service certificates with which to provision
    * to the new role. This element is only used with the
    * WindowsProvisioningConfiguration set.
    */
    public void setStoredCertificateSettings(ArrayList<StoredCertificateSettings> storedCertificateSettings)
    {
        this.storedCertificateSettings = storedCertificateSettings;
    }
    
    private ArrayList<String> subnetNames;
    
    /**
    * The list of Virtual Network subnet names that the deployment belongs to.
    * This element is only used with the NetworkConfigurationSet type.
    */
    public ArrayList<String> getSubnetNames()
    {
        return this.subnetNames;
    }
    
    /**
    * The list of Virtual Network subnet names that the deployment belongs to.
    * This element is only used with the NetworkConfigurationSet type.
    */
    public void setSubnetNames(ArrayList<String> subnetNames)
    {
        this.subnetNames = subnetNames;
    }
    
    private String timeZone;
    
    /**
    * Optional.  Specifies the time zone for the virtual machine. This element
    * is only used with the WindowsProvisioningConfiguration set.  For a
    * complete list of supported time zone entries, you can:  Refer to the
    * values listed in the registry entry
    * HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows
    * NT\\CurrentVersion\\Time Zones on a computer running Windows 7, Windows
    * Server 2008, and Windows Server 2008 R2.  You can use the tzutil
    * command-line tool to list the valid time. The tzutil tool is installed
    * by default on Windows 7, Windows Server 2008, and Windows Server 2008 R2.
    */
    public String getTimeZone()
    {
        return this.timeZone;
    }
    
    /**
    * Optional.  Specifies the time zone for the virtual machine. This element
    * is only used with the WindowsProvisioningConfiguration set.  For a
    * complete list of supported time zone entries, you can:  Refer to the
    * values listed in the registry entry
    * HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows
    * NT\\CurrentVersion\\Time Zones on a computer running Windows 7, Windows
    * Server 2008, and Windows Server 2008 R2.  You can use the tzutil
    * command-line tool to list the valid time. The tzutil tool is installed
    * by default on Windows 7, Windows Server 2008, and Windows Server 2008 R2.
    */
    public void setTimeZone(String timeZone)
    {
        this.timeZone = timeZone;
    }
    
    private String userName;
    
    /**
    * Required. Specifies the name of a user to be created in the sudoer group
    * of the virtual machine. User names are ASCII character strings 1 to 32
    * characters in length. This element is only used with the
    * LinuxProvisioningConfiguration set.
    */
    public String getUserName()
    {
        return this.userName;
    }
    
    /**
    * Required. Specifies the name of a user to be created in the sudoer group
    * of the virtual machine. User names are ASCII character strings 1 to 32
    * characters in length. This element is only used with the
    * LinuxProvisioningConfiguration set.
    */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    private String userPassword;
    
    /**
    * Required. Specifies the password for user name. Passwords are ASCII
    * character strings 6 to 72 characters in length. This element is only
    * used with the LinuxProvisioningConfiguration set.
    */
    public String getUserPassword()
    {
        return this.userPassword;
    }
    
    /**
    * Required. Specifies the password for user name. Passwords are ASCII
    * character strings 6 to 72 characters in length. This element is only
    * used with the LinuxProvisioningConfiguration set.
    */
    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword;
    }
    
    private WindowsRemoteManagementSettings windowsRemoteManagement;
    
    /**
    * Optional. Configures the Windows Remote Management service on the virtual
    * machine, which enables remote Windows PowerShell.
    */
    public WindowsRemoteManagementSettings getWindowsRemoteManagement()
    {
        return this.windowsRemoteManagement;
    }
    
    /**
    * Optional. Configures the Windows Remote Management service on the virtual
    * machine, which enables remote Windows PowerShell.
    */
    public void setWindowsRemoteManagement(WindowsRemoteManagementSettings windowsRemoteManagement)
    {
        this.windowsRemoteManagement = windowsRemoteManagement;
    }
    
    /**
    * Initializes a new instance of the ConfigurationSet class.
    *
    */
    public ConfigurationSet()
    {
        this.inputEndpoints = new ArrayList<InputEndpoint>();
        this.storedCertificateSettings = new ArrayList<StoredCertificateSettings>();
        this.subnetNames = new ArrayList<String>();
    }
}