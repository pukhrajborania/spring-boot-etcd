/*
 * Copyright 2015 Zalando SE
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
 */
package org.zalando.boot.etcd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The etcd member response object from members API.
 * 
 * @see <a href="https://coreos.com/etcd/docs/2.1.0/other_apis.html">https://
 *      coreos.com/etcd/docs/2.1.0/other_apis.html</a>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EtcdMember {

	/**
	 * identifier
	 */
	private String id;

	/**
	 * name
	 */
	private String name;

	/**
	 * peer URLs
	 */
	private String[] peerURLs;

	/**
	 * client URLs
	 */
	private String[] clientURLs;

}
