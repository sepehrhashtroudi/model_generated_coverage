var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":51,"id":34528,"methods":[],"name":"TestCyclicTypes","sl":14},{"el":37,"id":34528,"methods":[{"el":31,"sc":9,"sl":28},{"el":33,"sc":9,"sl":33},{"el":34,"sc":9,"sl":34},{"el":36,"sc":9,"sl":36}],"name":"TestCyclicTypes.Bean","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
