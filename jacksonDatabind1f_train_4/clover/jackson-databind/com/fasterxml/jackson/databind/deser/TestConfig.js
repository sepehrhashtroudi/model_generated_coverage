var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":85,"id":34670,"methods":[{"el":50,"sc":1,"sl":44},{"el":59,"sc":1,"sl":53},{"el":71,"sc":1,"sl":62}],"name":"TestConfig","sl":12},{"el":16,"id":34670,"methods":[],"name":"TestConfig.Dummy","sl":16},{"el":18,"id":34670,"methods":[],"name":"TestConfig.EmptyDummy","sl":18},{"el":25,"id":34670,"methods":[{"el":24,"sc":9,"sl":23}],"name":"TestConfig.AnnoBean","sl":20},{"el":27,"id":34672,"methods":[],"name":"TestConfig.Alpha","sl":27},{"el":31,"id":34672,"methods":[],"name":"TestConfig.SimpleBean","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_210":{"methods":[{"sl":44}],"name":"testOverrideIntrospectors139","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49}]},"test_321":{"methods":[{"sl":53}],"name":"testEnumsWhenDisabled149","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58}]},"test_5":{"methods":[{"sl":23},{"sl":62}],"name":"testAnnotationsDisabled576","pass":true,"statements":[{"sl":24},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [5], [5], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [210], [210], [210], [210], [210], [210], [], [], [], [321], [321], [321], [321], [321], [321], [], [], [], [5], [5], [5], [5], [5], [5], [5], [5], [5], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
