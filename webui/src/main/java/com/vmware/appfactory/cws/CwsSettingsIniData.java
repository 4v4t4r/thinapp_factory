/* ***********************************************************************
 * VMware ThinApp Factory
 * Copyright (c) 2009-2013 VMware, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ***********************************************************************/

package com.vmware.appfactory.cws;

import java.util.TreeMap;

/**
 * Defines CWS project settings related to an "INI file" data structure. This
 * is used, for example, to define the "package.ini" file in a CWS project.
 *
 * This is based on the CWS API specification: do not edit unless it remains
 * compatible.
 *
 * @author levans
 *
 */
public class CwsSettingsIniData
   extends TreeMap<String, String>
{
   private static final long serialVersionUID = -4368483915265109332L;

   /*
    * A simple mapping that maps keys to values.
    * TODO: data types, etc.
    */
}
