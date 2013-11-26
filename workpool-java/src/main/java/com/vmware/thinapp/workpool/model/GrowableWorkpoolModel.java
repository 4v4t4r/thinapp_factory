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

package com.vmware.thinapp.workpool.model;

/**
 * A workpool that is able to create new instances for itself.
 *
 * @param <T> the type of isntancer to use
 */
public abstract class GrowableWorkpoolModel<T extends InstanceableModel> extends WorkpoolModel {
   private static final long serialVersionUID = -1760462916955903L;

   @Override
   public boolean isGrowable() {
      return true;
   }

   public abstract T getInstancer();

   public abstract void setInstancer(T instancer);
}
