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

package com.vmware.appfactory.fileshare.dto;

import com.vmware.appfactory.application.model.Application;
import com.vmware.appfactory.recipe.model.Recipe;

/**
 * A simple wrapper around two FileShareSyncResponse, one for applications
 * and one for recipes.
 */
public class FileShareSyncResponses
{
   public FileShareSyncResponse<Application> appSyncResponse;

   public FileShareSyncResponse<Recipe> recipeSyncResponse;
}
