var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":15877,"methods":[{"el":27,"sc":1,"sl":15}],"name":"TestUtf8Generator","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_85":{"methods":[{"sl":15}],"name":"testUtf8Issue46299","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":24},{"sl":25},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [85], [85], [85], [85], [85], [85], [85], [85], [], [85], [85], [85], [], [], [], []]
