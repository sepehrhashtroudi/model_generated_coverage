var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":95,"id":17400,"methods":[{"el":31,"sc":1,"sl":15},{"el":47,"sc":1,"sl":34},{"el":54,"sc":1,"sl":50},{"el":63,"sc":1,"sl":57},{"el":94,"sc":5,"sl":84}],"name":"TestJsonStringEncoder","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_121":{"methods":[{"sl":57}],"name":"testQuoteAsString128","pass":true,"statements":[{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62}]},"test_42":{"methods":[{"sl":50}],"name":"testCtrlChars127","pass":true,"statements":[{"sl":51},{"sl":52},{"sl":53}]},"test_47":{"methods":[{"sl":15},{"sl":84}],"name":"testQuoteAsUTF842","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":86},{"sl":87},{"sl":88},{"sl":90},{"sl":91},{"sl":93}]},"test_82":{"methods":[{"sl":34}],"name":"testQuoteLongAsString126","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [47], [47], [47], [47], [47], [47], [47], [47], [47], [47], [47], [47], [47], [47], [47], [], [], [], [], [82], [82], [82], [82], [82], [82], [82], [], [82], [82], [82], [82], [82], [], [], [], [42], [42], [42], [42], [], [], [], [121], [121], [121], [121], [121], [121], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [47], [], [47], [47], [47], [], [47], [47], [], [47], [], [], []]
