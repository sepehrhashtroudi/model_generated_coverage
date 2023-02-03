var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":64,"id":4999,"methods":[{"el":37,"sc":2,"sl":35},{"el":41,"sc":2,"sl":39},{"el":45,"sc":2,"sl":43},{"el":50,"sc":2,"sl":47},{"el":54,"sc":2,"sl":52},{"el":63,"sc":2,"sl":56}],"name":"JarArchiveEntry","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_35":{"methods":[{"sl":43}],"name":"testDeleteFromJar19","pass":true,"statements":[{"sl":44}]},"test_5":{"methods":[{"sl":39},{"sl":43}],"name":"testDeleteFromAndAddToJar37","pass":true,"statements":[{"sl":40},{"sl":44}]},"test_9":{"methods":[{"sl":43}],"name":"testJarUnarchive17","pass":true,"statements":[{"sl":44}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [5], [5], [], [], [5, 9, 35], [5, 9, 35], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
