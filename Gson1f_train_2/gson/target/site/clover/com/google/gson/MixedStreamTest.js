var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":139,"id":4226,"methods":[{"el":61,"sc":1,"sl":51},{"el":74,"sc":1,"sl":64},{"el":91,"sc":1,"sl":77}],"name":"MixedStreamTest","sl":30},{"el":138,"id":4258,"methods":[{"el":124,"sc":5,"sl":121},{"el":127,"sc":5,"sl":127},{"el":131,"sc":5,"sl":129},{"el":137,"sc":5,"sl":133}],"name":"MixedStreamTest.Car","sl":117}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_5":{"methods":[{"sl":51},{"sl":127}],"name":"testReaderDoesNotMutateState70","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60}]},"test_86":{"methods":[{"sl":77}],"name":"testWriteDoesNotMutateState156","pass":true,"statements":[{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90}]},"test_90":{"methods":[{"sl":64}],"name":"testReadInvalidState129","pass":true,"statements":[{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [5], [5], [5], [5], [5], [5], [5], [5], [5], [5], [], [], [], [90], [90], [90], [90], [90], [90], [90], [], [], [], [], [], [], [86], [86], [86], [86], [86], [86], [86], [86], [86], [86], [86], [86], [86], [86], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [5], [], [], [], [], [], [], [], [], [], [], [], []]
