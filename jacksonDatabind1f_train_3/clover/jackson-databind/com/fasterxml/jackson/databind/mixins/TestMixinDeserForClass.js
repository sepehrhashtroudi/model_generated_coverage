var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":69,"id":36112,"methods":[{"el":56,"sc":1,"sl":45}],"name":"TestMixinDeserForClass","sl":10},{"el":29,"id":36112,"methods":[{"el":28,"sc":9,"sl":28}],"name":"TestMixinDeserForClass.BaseClass","sl":19},{"el":33,"id":36114,"methods":[],"name":"TestMixinDeserForClass.LeafClass","sl":32},{"el":36,"id":36114,"methods":[],"name":"TestMixinDeserForClass.MixIn","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_575":{"methods":[{"sl":28},{"sl":45}],"name":"testClassMixInsForObjectClass417","pass":true,"statements":[{"sl":28},{"sl":46},{"sl":47},{"sl":49},{"sl":50},{"sl":53},{"sl":54}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [575], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [575], [575], [575], [], [575], [575], [], [], [575], [575], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
