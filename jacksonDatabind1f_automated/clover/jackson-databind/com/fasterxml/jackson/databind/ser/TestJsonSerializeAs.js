var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":34027,"methods":[],"name":"TestJsonSerializeAs","sl":8},{"el":14,"id":34027,"methods":[],"name":"TestJsonSerializeAs.Fooable","sl":12},{"el":22,"id":34027,"methods":[{"el":20,"sc":9,"sl":19},{"el":21,"sc":9,"sl":21}],"name":"TestJsonSerializeAs.FooImpl","sl":18},{"el":28,"id":34031,"methods":[{"el":27,"sc":9,"sl":25}],"name":"TestJsonSerializeAs.Fooables","sl":24},{"el":34,"id":34033,"methods":[{"el":33,"sc":9,"sl":31}],"name":"TestJsonSerializeAs.FooableWrapper","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
