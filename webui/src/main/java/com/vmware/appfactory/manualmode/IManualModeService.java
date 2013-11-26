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

package com.vmware.appfactory.manualmode;

import com.vmware.appfactory.common.exceptions.AfNotFoundException;
import com.vmware.appfactory.datastore.exception.DsException;
import com.vmware.appfactory.taskqueue.dto.CaptureRequest;
import com.vmware.thinapp.common.converter.dto.Status;
import com.vmware.thinapp.common.workpool.exception.WpException;

/**
 * This interface defines all interactions required to convert an app
 * in manual mode.
 *
 * @author saung
 * @since v1.0 5/9/2011
 */
public interface IManualModeService {
   /**
    * Create a new request to Manual mode.
    *
    * @param captureRequest - a valid build request object of applicable build components for an app.
    * @return an unique ticket id.
    */
   public String createRequest(CaptureRequest captureRequest) throws DsException, WpException, AfNotFoundException;

   /**
    * Check the status of the VM.
    *
    * @param ticketId - a valid ticket id.
    * @return a VM status
    */
   public Status checkStatus(Long ticketId);

   /**
    * Move to next stage of the manual mode workflow.
    *
    * @param ticketId - a valid ticket id.
    * @param stage - a valid stage.
    */
   public void next(Long ticketId, String stage);

   /**
    * Cancel a manual mode process.
    * @param ticketId - a valid ticket id.
    */
   public void cancel(Long ticketId);

}
