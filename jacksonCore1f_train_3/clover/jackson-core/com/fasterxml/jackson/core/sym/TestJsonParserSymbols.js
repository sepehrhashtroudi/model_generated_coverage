var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":92,"id":16736,"methods":[{"el":33,"sc":1,"sl":31},{"el":45,"sc":1,"sl":36},{"el":76,"sc":5,"sl":61},{"el":91,"sc":5,"sl":78}],"name":"TestJsonParserSymbols","sl":14},{"el":26,"id":16736,"methods":[{"el":24,"sc":9,"sl":24},{"el":25,"sc":9,"sl":25}],"name":"TestJsonParserSymbols.MyJsonFactory","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_19":{"methods":[{"sl":24},{"sl":31},{"sl":61},{"sl":78}],"name":"testByteSymbolsWithClose55","pass":true,"statements":[{"sl":24},{"sl":32},{"sl":63},{"sl":64},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":72},{"sl":73},{"sl":75},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":90}]},"test_83":{"methods":[{"sl":25},{"sl":36},{"sl":78}],"name":"testCharSymbolsWithEOF113","pass":true,"statements":[{"sl":25},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42},{"sl":43},{"sl":44},{"sl":80},{"sl":81},{"sl":86},{"sl":87},{"sl":88},{"sl":90}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [19], [83], [], [], [], [], [], [19], [19], [], [], [], [83], [83], [83], [83], [83], [], [83], [83], [83], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [19], [], [19], [19], [], [19], [19], [19], [19], [], [], [19], [19], [], [19], [], [], [19, 83], [], [19, 83], [19, 83], [19], [19], [19], [], [83], [83], [83], [], [19, 83], [], []]
