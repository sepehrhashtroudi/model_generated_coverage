var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":32395,"methods":[],"name":"TestMixinDeserForClass","sl":10},{"el":29,"id":32395,"methods":[{"el":28,"sc":9,"sl":28}],"name":"TestMixinDeserForClass.BaseClass","sl":19},{"el":33,"id":32397,"methods":[],"name":"TestMixinDeserForClass.LeafClass","sl":32},{"el":36,"id":32397,"methods":[],"name":"TestMixinDeserForClass.MixIn","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
