var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":101,"id":74650,"methods":[{"el":39,"sc":1,"sl":37},{"el":44,"sc":1,"sl":42},{"el":49,"sc":1,"sl":47},{"el":54,"sc":1,"sl":52},{"el":81,"sc":3,"sl":78}],"name":"JsFileLineParserTest","sl":31},{"el":100,"id":74661,"methods":[{"el":88,"sc":5,"sl":86},{"el":94,"sc":5,"sl":90},{"el":99,"sc":5,"sl":96}],"name":"JsFileLineParserTest.TestParser","sl":83}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":42},{"sl":78}],"name":"testMultiLine31733","pass":false,"statements":[{"sl":43},{"sl":79}]},"test_1336":{"methods":[{"sl":52},{"sl":78}],"name":"testMultiLine42234","pass":false,"statements":[{"sl":53},{"sl":79}]},"test_1407":{"methods":[{"sl":47},{"sl":78}],"name":"testMultiLine52028","pass":false,"statements":[{"sl":48},{"sl":79}]},"test_2306":{"methods":[{"sl":37},{"sl":78}],"name":"testSingleLine1537","pass":false,"statements":[{"sl":38},{"sl":79}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2306], [2306], [], [], [], [1], [1], [], [], [], [1407], [1407], [], [], [], [1336], [1336], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1, 1407, 1336, 2306], [1, 1407, 1336, 2306], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
