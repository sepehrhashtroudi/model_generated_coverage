var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":80,"id":33363,"methods":[{"el":53,"sc":1,"sl":45},{"el":67,"sc":1,"sl":56}],"name":"TestMixinDeserForClass","sl":10},{"el":29,"id":33363,"methods":[{"el":28,"sc":9,"sl":28}],"name":"TestMixinDeserForClass.BaseClass","sl":19},{"el":33,"id":33365,"methods":[],"name":"TestMixinDeserForClass.LeafClass","sl":32},{"el":36,"id":33365,"methods":[],"name":"TestMixinDeserForClass.MixIn","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_31":{"methods":[{"sl":28},{"sl":45}],"name":"testClassMixInsTopLevel30","pass":true,"statements":[{"sl":28},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52}]},"test_490":{"methods":[{"sl":28},{"sl":56}],"name":"testClassMixInsForObjectClass403","pass":true,"statements":[{"sl":28},{"sl":57},{"sl":58},{"sl":60},{"sl":61},{"sl":64},{"sl":65}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [31, 490], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [31], [31], [31], [31], [31], [31], [31], [31], [], [], [], [490], [490], [490], [], [490], [490], [], [], [490], [490], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
