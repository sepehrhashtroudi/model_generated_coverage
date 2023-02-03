var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":66,"id":40522,"methods":[{"el":61,"sc":1,"sl":52}],"name":"TestViewDeserialization","sl":7},{"el":16,"id":40522,"methods":[],"name":"TestViewDeserialization.ViewA","sl":16},{"el":17,"id":40522,"methods":[],"name":"TestViewDeserialization.ViewAA","sl":17},{"el":18,"id":40522,"methods":[],"name":"TestViewDeserialization.ViewB","sl":18},{"el":19,"id":40522,"methods":[],"name":"TestViewDeserialization.ViewBB","sl":19},{"el":33,"id":40522,"methods":[{"el":32,"sc":9,"sl":31}],"name":"TestViewDeserialization.Bean","sl":21},{"el":41,"id":40524,"methods":[],"name":"TestViewDeserialization.DefaultsBean","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":52}],"name":"testWithoutDefaultInclusion374","pass":true,"statements":[{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [10], [10], [10], [10], [10], [10], [10], [10], [10], [], [], [], [], [], []]
