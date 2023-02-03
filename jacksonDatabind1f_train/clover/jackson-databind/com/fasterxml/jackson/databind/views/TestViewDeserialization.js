var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":54,"id":33013,"methods":[],"name":"TestViewDeserialization","sl":7},{"el":16,"id":33013,"methods":[],"name":"TestViewDeserialization.ViewA","sl":16},{"el":17,"id":33013,"methods":[],"name":"TestViewDeserialization.ViewAA","sl":17},{"el":18,"id":33013,"methods":[],"name":"TestViewDeserialization.ViewB","sl":18},{"el":19,"id":33013,"methods":[],"name":"TestViewDeserialization.ViewBB","sl":19},{"el":33,"id":33013,"methods":[{"el":32,"sc":9,"sl":31}],"name":"TestViewDeserialization.Bean","sl":21},{"el":41,"id":33015,"methods":[],"name":"TestViewDeserialization.DefaultsBean","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
