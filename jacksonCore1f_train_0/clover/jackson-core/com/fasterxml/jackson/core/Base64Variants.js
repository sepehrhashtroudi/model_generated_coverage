var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":111,"id":218,"methods":[{"el":35,"sc":5,"sl":33},{"el":46,"sc":5,"sl":44},{"el":75,"sc":5,"sl":66},{"el":85,"sc":5,"sl":83},{"el":110,"sc":5,"sl":90}],"name":"Base64Variants","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":33},{"sl":44},{"sl":66},{"sl":83}],"name":"testWithEscaped23","pass":true,"statements":[{"sl":34},{"sl":45},{"sl":67},{"sl":69},{"sl":70},{"sl":74},{"sl":84}]},"test_17":{"methods":[{"sl":83}],"name":"testStreaming49","pass":true,"statements":[{"sl":84}]},"test_2":{"methods":[{"sl":33},{"sl":44},{"sl":66}],"name":"testCharEncoding109","pass":true,"statements":[{"sl":34},{"sl":45},{"sl":67},{"sl":69},{"sl":70},{"sl":74}]},"test_26":{"methods":[{"sl":83}],"name":"testIssue5599","pass":true,"statements":[{"sl":84}]},"test_35":{"methods":[{"sl":83}],"name":"testInArray16","pass":true,"statements":[{"sl":84}]},"test_82":{"methods":[{"sl":33},{"sl":44},{"sl":66}],"name":"testBase64UsingInputStream68","pass":true,"statements":[{"sl":34},{"sl":45},{"sl":67},{"sl":69},{"sl":70},{"sl":74}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1, 2, 82], [1, 2, 82], [], [], [], [], [], [], [], [], [], [1, 2, 82], [1, 2, 82], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1, 2, 82], [1, 2, 82], [], [1, 2, 82], [1, 2, 82], [], [], [], [1, 2, 82], [], [], [], [], [], [], [], [], [1, 17, 26, 35], [1, 17, 26, 35], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
