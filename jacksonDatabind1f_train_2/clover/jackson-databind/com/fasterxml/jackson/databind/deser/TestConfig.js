var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":85,"id":31134,"methods":[{"el":50,"sc":1,"sl":44},{"el":59,"sc":1,"sl":53},{"el":71,"sc":1,"sl":62}],"name":"TestConfig","sl":12},{"el":16,"id":31134,"methods":[],"name":"TestConfig.Dummy","sl":16},{"el":18,"id":31134,"methods":[],"name":"TestConfig.EmptyDummy","sl":18},{"el":25,"id":31134,"methods":[{"el":24,"sc":9,"sl":23}],"name":"TestConfig.AnnoBean","sl":20},{"el":27,"id":31136,"methods":[],"name":"TestConfig.Alpha","sl":27},{"el":31,"id":31136,"methods":[],"name":"TestConfig.SimpleBean","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_233":{"methods":[{"sl":53}],"name":"testEnumsWhenDisabled147","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58}]},"test_66":{"methods":[{"sl":23},{"sl":62}],"name":"testAnnotationsDisabled579","pass":true,"statements":[{"sl":24},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70}]},"test_72":{"methods":[{"sl":44}],"name":"testOverrideIntrospectors140","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [66], [66], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [72], [72], [72], [72], [72], [72], [], [], [], [233], [233], [233], [233], [233], [233], [], [], [], [66], [66], [66], [66], [66], [66], [66], [66], [66], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
