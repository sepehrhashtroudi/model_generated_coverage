var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":40520,"methods":[{"el":20,"sc":1,"sl":16},{"el":40,"sc":1,"sl":23}],"name":"TestArraySerialization","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_182":{"methods":[{"sl":16}],"name":"testStringArray205","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19}]},"test_456":{"methods":[{"sl":23}],"name":"testBigIntArray571","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [182], [182], [182], [182], [], [], [], [456], [456], [456], [456], [456], [], [456], [456], [456], [456], [456], [456], [456], [456], [], [456], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
