/*******************************************************************************
 * Copyright 2017 Seldon Technologies Ltd (http://www.seldon.io/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package io.seldon.clustermanager.k8s.client;

import java.io.IOException;

import org.springframework.stereotype.Component;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ProtoClient;
import io.kubernetes.client.util.Config;

@Component
public class K8sDefaultClientProvider implements K8sClientProvider {

	@Override
	public ApiClient getClient() throws IOException {
		return Config.defaultClient();
	}

	@Override
	public ProtoClient getProtoClient() throws IOException {
		return new ProtoClient(Config.defaultClient());
	}

}
