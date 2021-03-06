/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsResponse.Snapshot;
import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsResponse.Snapshot.SourceDiskType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnapshotsResponseUnmarshaller {

	public static DescribeSnapshotsResponse unmarshall(DescribeSnapshotsResponse describeSnapshotsResponse, UnmarshallerContext context) {
		
		describeSnapshotsResponse.setRequestId(context.stringValue("DescribeSnapshotsResponse.RequestId"));
		describeSnapshotsResponse.setTotalCount(context.integerValue("DescribeSnapshotsResponse.TotalCount"));
		describeSnapshotsResponse.setPageNumber(context.integerValue("DescribeSnapshotsResponse.PageNumber"));
		describeSnapshotsResponse.setPageSize(context.integerValue("DescribeSnapshotsResponse.PageSize"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < context.lengthValue("DescribeSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot  snapshot = new Snapshot();
			snapshot.setSnapshotId(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setSnapshotName(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			snapshot.setProgress(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Progress"));
			snapshot.setProductCode(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ProductCode"));
			snapshot.setSourceDiskId(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskId"));
			snapshot.setSourceDiskType(SourceDiskType.getEnum(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskType")));
			snapshot.setSourceDiskSize(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskSize"));
			snapshot.setDescription(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Description"));
			snapshot.setCreationTime(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].CreationTime"));
			snapshot.setStatus(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setUsage(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Usage"));

			snapshots.add(snapshot);
		}
		describeSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeSnapshotsResponse;
	}
}