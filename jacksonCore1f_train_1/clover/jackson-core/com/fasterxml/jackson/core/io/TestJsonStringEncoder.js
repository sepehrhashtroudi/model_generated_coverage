var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":88,"id":16357,"methods":[{"el":31,"sc":1,"sl":15},{"el":38,"sc":1,"sl":34},{"el":47,"sc":1,"sl":41},{"el":56,"sc":1,"sl":50},{"el":87,"sc":5,"sl":77}],"name":"TestJsonStringEncoder","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_100":{"methods":[{"sl":50},{"sl":77}],"name":"testEncodeAsUTF8127","pass":true,"statements":[{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":79},{"sl":80},{"sl":81},{"sl":83},{"sl":84},{"sl":86}]},"test_106":{"methods":[{"sl":34}],"name":"testCtrlChars125","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37}]},"test_121":{"methods":[{"sl":41}],"name":"testQuoteAsString126","pass":true,"statements":[{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46}]},"test_70":{"methods":[{"sl":15},{"sl":77}],"name":"testQuoteAsUTF841","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":79},{"sl":80},{"sl":81},{"sl":83},{"sl":84},{"sl":86}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [], [], [], [], [106], [106], [106], [106], [], [], [], [121], [121], [121], [121], [121], [121], [], [], [], [100], [100], [100], [100], [100], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [70, 100], [], [70, 100], [70, 100], [70, 100], [], [70, 100], [70, 100], [], [70, 100], [], [], []]
