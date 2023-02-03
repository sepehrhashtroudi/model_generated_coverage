var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":36837,"methods":[{"el":20,"sc":1,"sl":8}],"name":"TestMissingNode","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_441":{"methods":[{"sl":8}],"name":"testMissing92","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [441], [441], [441], [441], [441], [441], [441], [441], [441], [441], [441], [441], [], [], [], []]
