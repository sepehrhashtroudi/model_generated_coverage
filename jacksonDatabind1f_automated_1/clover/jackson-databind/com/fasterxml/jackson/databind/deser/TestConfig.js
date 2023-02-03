var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":33189,"methods":[],"name":"TestConfig","sl":12},{"el":16,"id":33189,"methods":[],"name":"TestConfig.Dummy","sl":16},{"el":18,"id":33189,"methods":[],"name":"TestConfig.EmptyDummy","sl":18},{"el":25,"id":33189,"methods":[{"el":24,"sc":9,"sl":23}],"name":"TestConfig.AnnoBean","sl":20},{"el":27,"id":33191,"methods":[],"name":"TestConfig.Alpha","sl":27},{"el":31,"id":33191,"methods":[],"name":"TestConfig.SimpleBean","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
