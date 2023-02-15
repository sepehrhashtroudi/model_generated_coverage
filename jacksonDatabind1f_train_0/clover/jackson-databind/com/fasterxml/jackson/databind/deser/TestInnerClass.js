var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":31950,"methods":[],"name":"TestInnerClass","sl":5},{"el":26,"id":31950,"methods":[{"el":13,"sc":7,"sl":13},{"el":18,"sc":7,"sl":14}],"name":"TestInnerClass.Dog","sl":8},{"el":25,"id":31955,"methods":[{"el":24,"sc":11,"sl":24}],"name":"TestInnerClass.Dog.Brain","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
