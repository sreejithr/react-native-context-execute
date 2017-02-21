var BatchedBridge = require('BatchedBridge');

export default function ContextExecute(onRun) {
  this.init = onRun => {
    this.onRun = onRun;
    BatchedBridge.registerCallableModule('ContextExecutorJSModule', this);
  }

  this.execute = (op, data) => {
    this.onRun(op, data);
  }

  this.init(onRun);
  return this;
};
