var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":34021,"methods":[],"name":"TestJsonSerialize3","sl":11},{"el":24,"id":34021,"methods":[{"el":23,"sc":9,"sl":15}],"name":"TestJsonSerialize3.FooToBarSerializer","sl":14},{"el":29,"id":34027,"methods":[],"name":"TestJsonSerialize3.MyObject","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
