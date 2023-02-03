var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":8620,"methods":[{"el":32,"sc":3,"sl":30},{"el":37,"sc":3,"sl":34},{"el":42,"sc":3,"sl":39}],"name":"ErrorPass","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2185":{"methods":[{"sl":30},{"sl":34},{"sl":39}],"name":"testInlineVariables1808","pass":true,"statements":[{"sl":31},{"sl":35},{"sl":36},{"sl":41}]},"test_289":{"methods":[{"sl":30},{"sl":34},{"sl":39}],"name":"testTightenTypesWithoutTypeCheck1501","pass":true,"statements":[{"sl":31},{"sl":35},{"sl":36},{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2185, 289], [2185, 289], [], [], [2185, 289], [2185, 289], [2185, 289], [], [], [2185, 289], [], [2185, 289], [], []]
