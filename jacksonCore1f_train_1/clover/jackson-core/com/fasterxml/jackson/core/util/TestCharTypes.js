var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":19,"id":14082,"methods":[{"el":16,"sc":1,"sl":9}],"name":"TestCharTypes","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2":{"methods":[{"sl":9}],"name":"testQuoting123","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [2], [2], [2], [2], [2], [2], [2], [], [], [], []]
