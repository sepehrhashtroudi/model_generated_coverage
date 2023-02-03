var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":64,"id":37667,"methods":[{"el":50,"sc":1,"sl":44}],"name":"TestConfig","sl":12},{"el":16,"id":37667,"methods":[],"name":"TestConfig.Dummy","sl":16},{"el":18,"id":37667,"methods":[],"name":"TestConfig.EmptyDummy","sl":18},{"el":25,"id":37667,"methods":[{"el":24,"sc":9,"sl":23}],"name":"TestConfig.AnnoBean","sl":20},{"el":27,"id":37669,"methods":[],"name":"TestConfig.Alpha","sl":27},{"el":31,"id":37669,"methods":[],"name":"TestConfig.SimpleBean","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
