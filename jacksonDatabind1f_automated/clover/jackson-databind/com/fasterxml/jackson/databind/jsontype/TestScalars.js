var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":33493,"methods":[],"name":"TestScalars","sl":9},{"el":18,"id":33493,"methods":[{"el":16,"sc":9,"sl":15},{"el":17,"sc":9,"sl":17}],"name":"TestScalars.DynamicWrapper","sl":11},{"el":20,"id":33496,"methods":[],"name":"TestScalars.TestEnum","sl":20},{"el":29,"id":33496,"methods":[{"el":27,"sc":9,"sl":26},{"el":28,"sc":9,"sl":28}],"name":"TestScalars.AbstractWrapper","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
