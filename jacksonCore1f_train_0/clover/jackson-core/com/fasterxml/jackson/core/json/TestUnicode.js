var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":41,"id":14502,"methods":[{"el":14,"sc":1,"sl":10},{"el":40,"sc":5,"sl":24}],"name":"TestUnicode","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_102":{"methods":[{"sl":10},{"sl":24}],"name":"testSurrogates62","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":26},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":34},{"sl":35},{"sl":36},{"sl":38},{"sl":39}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [102], [102], [102], [102], [], [], [], [], [], [], [], [], [], [], [102], [], [102], [], [102], [102], [102], [102], [102], [], [102], [102], [102], [], [102], [102], [], []]
